import Foundation

// 일단 string을 하나 씩 때어 낸 다음에 대소문자 lowercased uppercased로 바꾸는 형식

let s1 = readLine()!

for alphabet in s1 {
    if alphabet.isLowercase {
       print(alphabet.uppercased(), terminator: "")    
    }
    else {
        print(alphabet.lowercased(), terminator: "")        
    }
    
}
// print(s1)
// print(s1.lowercased())