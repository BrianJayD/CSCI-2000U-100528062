#!/bin/bash
tar xzvf cochlear-implant-trials-data.tar.gz
find ./*/NOTES -delete
mv data/*/* cleaned_data/
cd cleaned_data/
for file in *; do mv $file $file.txt; done
cd ..


