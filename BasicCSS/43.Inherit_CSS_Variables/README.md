# Inherit CSS Variables
When you create a variable, it is available for you to use inside the selector in which you create it. It also is available in any of that selector's descendants. This happens because CSS variables are inherited, just like ordinary properties.

To make use of inheritance, CSS variables are often defined in the :root element.

`:root` is a pseudo-class selector that matches the root element of the document, usually the `html` element. By creating your variables in `:root`, they will be available globally and can be accessed from any other selector in the style sheet.
## Task 43
Define a variable named `--penguin-belly` in the `:root` selector and give it the value of `pink`. You can then see that the variable is inherited and that all the child elements which use it get pink backgrounds.


