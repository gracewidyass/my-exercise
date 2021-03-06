# Create Flexible Layouts Using auto-fill
The repeat function comes with an option called auto-fill. This allows you to automatically insert as many rows or columns of your desired size as possible depending on the size of the container. You can create flexible layouts when combining `auto-fill` with `minmax`, like this:
```
repeat(auto-fill, minmax(60px, 1fr));
```
When the container changes size, this setup keeps inserting 60px columns and stretching them until it can insert another one. **Note**: If your container can't fit all your items on one row, it will move them down to a new one.
## Task 20
In the first grid, use `auto-fill` with `repeat` to fill the grid with columns that have a minimum width of 60px and maximum of 1fr. Then resize the preview to see auto-fill in action.



