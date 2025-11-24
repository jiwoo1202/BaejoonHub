import Foundation

func solution(_ a:Int, _ b:Int, _ c:Int, _ d:Int) -> Int {
    var dict = Dictionary<Int, Int>()

    for num in [a, b, c, d] {
        dict[num, default: 0] += 1
    }
    
    let sortDict = dict.sorted{ $0.value > $1.value }
    
    switch sortDict[0].value {
    case 4:
        return 1111 * sortDict[0].key
    case 3:
        var p = sortDict[0].key
        var q = sortDict[1].key
        
        return (10 * p + q) * (10 * p + q)
    case 2:
        var p = sortDict[0].key
        var q = sortDict[1].key
        if sortDict.count == 2 {
            return (p + q) * abs(p - q)
        } else {
            var r = sortDict[2].key
            return q * r
        }
    case 1:
        return dict.sorted(by: {$0.key > $1.key}).last!.key
    default:
        return 0
    }

    return 0
}