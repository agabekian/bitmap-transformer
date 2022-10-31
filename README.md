# Bitmap Converted

## Overview

A simple program that takes in a bmp and creates an altered version of that image

## Methods

- convertToGreyScale -> changes image to black and white
- convertToNegative  -> inverts image colors
- convertWhiteToRed  -> converts pixels that are near white to red

## To run

- This program runs from the terminal using gradlew with three input arguments:
  - source file path
  - output file path
  - image action

### Image Actions

- greyscale

![greyscale](./app/src/main/resources/baldy-grey.bmp)
- invert

![greyscale](./app/src/main/resources/badBaldy.bmp)
- whitetored (works best on well defined images)

![greyscale](./app/src/main/resources/scary-baldy.bmp)

### Mac
`./gradlew run --args 'src/main/resources/baldy-8bit.bmp src/main/resources/baldy-grey.bmp greyscale'`

### Win
`gradlew run --args "src/main/resources/table.bmp src/main/resources/inverted-table.bmp invert"`

#### Contributors:
- Jose Gonzalez
- Armen Agabekian
- Joe Rutkin

Thanks to Ben Mills for helping us get started!

[Repo used as ref](https://github.com/SharinaS/bitmap-transformer)

[Invert tutorial](http://www.java2s.com/Tutorials/Java/Graphics_How_to/Image/Convert_negative_image_to_positive.html)