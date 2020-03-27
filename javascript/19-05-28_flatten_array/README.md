>Challenge:
Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.
Example:
Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

# Learned Stuff

## Best answer
```javascript
function flattenAndSort(array) {
  return [].concat(...array).sort((a,b) => a - b);
}
```

## Spread Syntax
>Spread syntax allows an iterable such as an array expression or string to be expanded in places where zero or more arguments (for function calls) or elements (for array literals) are expected, or an object expression to be expanded in places where zero or more key-value pairs (for object literals) are expected.

```javascript
var array =[1,2,3]
var expanded = array
console.log(...expanded);
```

## `Array.reduce()`
>`array.reduce(function(total, currentValue, currentIndex, arr), initialValue)`

- **Whatever the function returns, becomes the new total value**
- **useful for accumulation based operations:

>```javascript
function flattenAndSort(array) {
  return array
    .reduce((result, current) => [...result, ...current],[])//here it spreads result and current into one growing array
    .sort((a, b) => a - b)
    ;
}
```

- **Good for manual integration**
