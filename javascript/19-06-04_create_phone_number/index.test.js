const createPhoneNumber = require('./index.js')

describe(createPhoneNumber, ()=>{
  it("can create a phone bnumber from 10 integer array input", ()=> {
     expect(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0])).toEqual("(123) 456-7890")
  })
  it("can create a phone bnumber from 10 integer array input", ()=> {
     expect(createPhoneNumber([0, 8, 0, 2, 4, 2, 7, 8, 9, 0])).toEqual("(080) 242-7890")
  })
})
