const friend = require("./index.js")

describe(friend, function(){
  it("can distinguish friend from foe", function(){
    expect(friend(["John"])).toEqual(["John"])
  })
  it("can distinguish friend from foe", function(){
    expect(friend(["Ryan", "Jimmy", "123", "4", "Cool Man"])).toEqual(["Ryan"])
  })
})
