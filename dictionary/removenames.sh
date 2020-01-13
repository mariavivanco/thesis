#!/bin/bash
dict=/Users/demo/Desktop/thesis/dictionary/masterdict.txt
clean=/Users/demo/Desktop/thesis/dictionary/cleandict.txt
echo Start
s=1
while read word; do
    chrlen=${#word}
    if [ $chrlen -ge 5 ]
    then
      echo $word >> $clean
    fi
done < $dict
