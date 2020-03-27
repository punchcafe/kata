const partList = require('./index.js')

describe(partList, () => {
  it("seperates simple arrays", ()=>{
    expect(partList(["hello","there","world"])).toEqual([["hello","there world"],["hello there", "world"]])
  })
  it("seperates simple arrays", ()=>{
    expect(partList(["hello","my","world"])).toEqual([["hello","my world"],["hello my", "world"]])
  })

})
