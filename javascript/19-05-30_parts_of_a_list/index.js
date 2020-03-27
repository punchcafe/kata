module.exports = (array) => {
  const returnArray = []
  for(var i = 1; i < array.length; i++){
    returnArray.push([array.slice(0,i).join(" "),array.slice(i,array.length).join(" ")])
  }
  return returnArray
}
