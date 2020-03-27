const duplicateCount = require('./index.js')

describe( duplicateCount, ()=>{
  it('returns number of characters which appear more than once in a string', ()=>{
    expect(duplicateCount("hithere")).toEqual(2)
  })
  it('returns number of characters which appear more than once in a string', ()=>{
    expect(duplicateCount("heloothere")).toEqual(3)
  })
  it('ignores case sensitivity', ()=>{
    expect(duplicateCount("aabBcde")).toEqual(2)
  })
})
