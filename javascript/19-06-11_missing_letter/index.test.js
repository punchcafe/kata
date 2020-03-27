const findMissingLetter = require('./index.js')

describe(findMissingLetter, ()=>{
  it("finds the missing letter in an array of consecutive letters",()=>{
    expect(findMissingLetter(['a','c'])).toEqual('b')
  })
  it("finds the missing letter in an array of consecutive letters",()=>{
    expect(findMissingLetter(['a','b','d'])).toEqual('c')
  })
})
