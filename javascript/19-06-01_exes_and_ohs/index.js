module.exports = (str) => {
  const filtered = str.toLowerCase().split("").filter((char)=>{return "xo".includes(char)})
  return filtered.length === (filtered.filter((char)=>{return "x".includes(char)}).length)*2
}
