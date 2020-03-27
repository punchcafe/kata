module.exports = (twoDimensionalArray) => {
  var flattenedArray = [];
  flattenedArray = flattenedArray.concat(...twoDimensionalArray)
  flattenedArray.sort((a,b)=>{return a-b})
  return flattenedArray
}
