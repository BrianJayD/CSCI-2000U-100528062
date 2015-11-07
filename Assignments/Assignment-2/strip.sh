#Brian Domingo 100528062
#!/bin/bash

#Variables
read k 
read m 
read filename 

#Tail doesn't go out of bounds
let "k += 1"

#Commands
echo | tail -n +$k $filename | head -n -$m  