const duplicateCount = (text) => {
  return text.toLowerCase().split("").reduce((duplicates, character, i)=>{
    var searchResultArray = [].concat((text.toLowerCase().slice(0,i).match(new RegExp(character,'g'))) || [])
    return searchResultArray.length === 1 ? duplicates.concat([character]) : duplicates
  }, []).length
}
module.exports = duplicateCount
