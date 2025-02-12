import Foundation

func solution(_ keymap: [String], _ targets: [String]) -> [Int] {
    
    /// 정답
    var answer = [Int](repeating:0,count:targets.count)
    
    /// 딕셔너리
    var dict = [Character: Int]()

    
    /// 각 알파벳당 몇번이 최소값인 구해야 함
    for key in keymap{
        /// 키 인덱스
        for (index,char) in key.enumerated(){
            if let existing = dict[char]{
                dict[char] = min(existing,index+1)
            }else{
                dict[char] = index + 1
            }
        }
    } 
    
    /// target에 해당하는 알파벳이 몇번인지 구해야 함
    /// target = abcd  / aabb
    for (tIdx, target) in targets.enumerated(){
        var totalNum = 0
        for t in target {
            if let count = dict[t]{
                totalNum += count
            }else{
                totalNum = -1
                break
            }
        }
        answer[tIdx] = totalNum
    }
    
    return answer
}
