import Foundation


func solution(_ n: Int) -> [[Int]] {
    var result = Array(repeating: Array(repeating: 0, count: n), count: n)
    
    let dx = [0, 1, 0, -1]
    let dy = [1, 0, -1, 0]
    
    func dfs(_ x: Int, _ y: Int, _ dir: Int, _ num: Int) {

        result[x][y] = num
        
        if num == n*n { return }
        
        // 다음 칸 계산
        let nx = x + dx[dir]
        let ny = y + dy[dir]
        
        // 안벗어났으면 계속 진행 하고 아니면 방향 바꾸기
        if nx >= 0, nx < n, ny >= 0, ny < n, result[nx][ny] == 0 {
            dfs(nx, ny, dir, num + 1)
        } else {
            let ndir = (dir + 1) % 4
            let nx2 = x + dx[ndir]
            let ny2 = y + dy[ndir]
            dfs(nx2, ny2, ndir, num + 1)
        }
    }
    
    dfs(0, 0, 0, 1)
    print(result)
    return result
}