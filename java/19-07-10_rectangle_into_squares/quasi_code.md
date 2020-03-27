Take a recursive approach

base case: height == length

otherwise: cut off a square with side length = height or width (depending on which is shorter). Call function on remainder.

return: Integer list of individual square lengths.

Quasi-Code:
```
function sqInRect(length, width){
  if length==width
    return [length]; //base case;
  else
  if length<width {
    [length] + return sqrInRect(length, width-length)
  } else {
    [width] + return sqrInRect(length-width, width)
  }
}
```
