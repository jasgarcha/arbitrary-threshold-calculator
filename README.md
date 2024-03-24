# arbitrary-threshold-calculator
## Logic
The program initializes with arbitrary constants: `threshold 1`, `threshold 2`, and `f3`. 

`f0`, `f1`, `f2` are randomly generated and added to the result set if they satisfy the conditions: `f0 > f1`,  `f3 > f2`, `|(f0+f1)-(f0+f2)| < threshold1`, and `|(f2+f3)-(f1+f3)| < threshold2`. 

`f0`, `f1`, `f2` are generated until the result set reaches the desired cardinality. 

The set is presented as comma separated values.

Run the program multiple times via a batch script and saving the output to a `.csv` file, for a variety of result sets.

## Todo
The developer has to manually change the threshold values in the code. So, for flexibility, allow the user to input arbitrary threshold values and furthermore, add `n` thresholds, before the result set is calculated. A barebones implementation of this functionality using `Scanner` is provided.