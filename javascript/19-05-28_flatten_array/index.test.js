const flatten_and_sort = require('./index.js');

describe(flatten_and_sort, ()=>{

  it("flattens and sorts a simple 2-D array",()=>{
    expect(flatten_and_sort([[1]])).toEqual([1])
  })
  it("flattens an sorts an ordered 2-D array",()=>{
    expect(flatten_and_sort([[1,2],[3,4]])).toEqual([1,2,3,4])
  })
  it("flattens an sorts an unordered 2-D array",()=>{
    expect(flatten_and_sort([[1,3,2],[4,8],[11,3]])).toEqual([1,2,3,3,4,8,11])
  })


})
