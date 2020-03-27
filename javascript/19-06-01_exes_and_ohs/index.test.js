const XO = require("./index.js")

describe(XO,()=>{
  it("returns true when passed no xs or os",()=>{
    expect(XO("hi")).toEqual(true)
  })
  it("returns false when uneven",()=>{
    expect(XO("xl")).toEqual(false)
  })
  it("returns true when even",()=>{
    expect(XO("xxoo")).toEqual(true)
  })
  it("returns true when even with captials",()=>{
    expect(XO("Xxoo")).toEqual(true)
  })
})
