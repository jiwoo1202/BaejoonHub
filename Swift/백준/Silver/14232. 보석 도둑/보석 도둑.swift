import Foundation

var n = Int(readLine()!)!
var factors: [Int] = []
var divisor = 2

while divisor * divisor <= n {

    if n % divisor == 0 {
        factors.append(divisor)
        n /= divisor
    } else {
        divisor += 1
    }
}

if n > 1 {
    factors.append(n)
}

print("\(factors.count)")
factors.forEach { print($0, terminator: " ") }
