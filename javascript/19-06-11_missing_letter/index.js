const findMissingLetter = (array) => {
  const slice = 'abcdefghijklmnopqrstuvwxyz'.match(
    new RegExp(array[0]+".*"+array[array.length-1],'g'))[0]
  for(var i=0; i<slice.length; i++){
    if(!array.includes(slice[i])){ return slice[i] }
  }
}
module.exports = findMissingLetter
