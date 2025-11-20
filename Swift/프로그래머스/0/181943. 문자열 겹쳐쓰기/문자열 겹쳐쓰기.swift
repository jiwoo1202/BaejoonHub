import Foundation

func solution(_ my_string:String, _ overwrite_string:String, _ s:Int) -> String {
    let startIndex = my_string.index(my_string.startIndex, offsetBy: s)
    let endIndex = my_string.index(startIndex, offsetBy: overwrite_string.count)
    
    let prefix = my_string[..<startIndex]
    let suffix = my_string[endIndex...]
 
    return "\(prefix)\(overwrite_string)\(suffix)"
}