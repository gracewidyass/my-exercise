# Place Items in Grid Areas Using the grid-area Property
After creating an area's template for your grid container, as shown in the previous challenge, you can place an item in your custom area by referencing the name you gave it. To do this, you use the `grid-area` property on an item like this:
```
.item1 {
  grid-area: header;
}
```
This lets the grid know that you want the `item1` class to go in the area named `header`. In this case, the item will use the entire top row because that whole row is named as the header area.
## Task 16
Place an element with the `item5` class in the `footer` area using the `grid-area` property.



