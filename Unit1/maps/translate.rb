#!/usr/bin/env ruby

require 'rexml/document'
include REXML

def printUsage
   puts "Usage: translate.rb [file.wld]"
   exit
end

printUsage if ARGV.length != 1

print "Translating #{ARGV[0]}..."

File.open(ARGV[0]) do |file|
   root = Element.new("world")
   properties = Element.new("properties", root)
   objects = Element.new("objects", root)
   
   size_x = nil
   size_y = nil

   file.each_line do |line|
      if line =~ /avenues ([0-9]+)/
         size_x = $1
      elsif line =~ /streets ([0-9]+)/
         size_y = $1
      elsif line =~ /beepers ([0-9]+) ([0-9]+) ([0-9]+)/
         beeper = Element.new("beeper", objects)
         beeper.attributes["x"] = $2
         beeper.attributes["y"] = $1
         beeper.attributes["num"] = $3
      elsif line =~ /eastwestwalls ([0-9]+) ([0-9]+) ([0-9]+)/
         wall = Element.new("wall", objects)
         wall.attributes["x"] = $2
         wall.attributes["y"] = $1
         wall.attributes["style"] = "horizontal"
         wall.attributes["length"] = 1
      elsif line =~ /northsouthwalls ([0-9]+) ([0-9]+) ([0-9]+)/
         wall = Element.new("wall", objects)
         wall.attributes["x"] = $1
         wall.attributes["y"] = $2
         wall.attributes["style"] = "vertical"
         wall.attributes["length"] = 1
      end
   end

   if size_x != nil && size_y != nil
      defaultSize = Element.new("defaultSize", properties)
      defaultSize.attributes["width"] = size_x
      defaultSize.attributes["height"] = size_y
   end
   
   io = nil
   if ARGV[0] =~ /(\w+)\.(\w+)/
      io = File.new($1 + ".map", "w")
   else
      io = File.new("out.map", "w")
   end

   root.write(io, 0)

   puts " Done."
end
