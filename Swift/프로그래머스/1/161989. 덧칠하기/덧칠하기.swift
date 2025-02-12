import Foundation

func solution(_ n:Int, _ m:Int, _ section:[Int]) -> Int {
    var now = section[0] /// 1
    var count = 0
    
    /// 2 3 6
    for s in section {
        if s>=now{
            count+=1
            now = s+m
        }
    }
    return count;
}