import Foundation

func leftNum(_ dotA: [Int], _ dotB: [Int]) -> Float {
    var x1 = dotA[0]
    var y1 = dotA[1]
    var x2 = dotB[0]
    var y2 = dotB[1]
    
    return Float(y2-y1) / Float(x2 - x1)
}

func solution(_ dots:[[Int]]) -> Int {
    
    if leftNum(dots[0], dots[1]) == leftNum(dots[2], dots[3]) {
        return 1
    }
    if leftNum(dots[0], dots[2]) == leftNum(dots[1], dots[3]) {
        return 1
    }
    if leftNum(dots[0], dots[3]) == leftNum(dots[1], dots[2]) {
        return 1
    }
    return 0
}

// 9 - 1  = 8 
// 2 - 4 = -2

// 11 - 3 = 8
// 6 - 8 = -2

// 2 - 3 = -1
// 5 - 5 = 0

// 5 - 4 = 1
// 10 - 1 = 9

