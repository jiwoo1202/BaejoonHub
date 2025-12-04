import Foundation

func solution(_ survey:[String], _ choices:[Int]) -> String {
    var map: [String: Int] = [:]
    
    for i in survey.indices {
        var choice = choices[i]
        
        if choice > 0 && choice < 4 {
            let key = String(survey[i].first!)
            let score = 4 - choice
            map[key, default: 0] += score
        }
        else {
            let key = String(survey[i].last!)
            let score = choice - 4
            map[key, default: 0] += score
        }
    }
    let rt = map["R", default: 0] >= map["T", default: 0] ? "R" : "T"
    let cf = map["C", default: 0] >= map["F", default: 0] ? "C" : "F"
    let jm = map["J", default: 0] >= map["M", default: 0] ? "J" : "M"
    let an = map["A", default: 0] >= map["N", default: 0] ? "A" : "N"
    
    let result = rt + cf + jm + an
    print(result)
    return result
    
}