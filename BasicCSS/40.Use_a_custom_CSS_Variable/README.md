# Use a custom CSS Variable
After you create your variable, you can assign its value to other CSS properties by referencing the name you gave it.
```
background: var(--penguin-skin);
```
This will change the background of whatever element you are targeting to gray because that is the value of the `--penguin-skin` variable. Note that styles will not be applied unless the variable names are an exact match.
## Task 40
Apply the `--penguin-skin` variable to the `background` property of the `penguin-top`, `penguin-bottom`, `right-hand` and `left-hand` classes.

