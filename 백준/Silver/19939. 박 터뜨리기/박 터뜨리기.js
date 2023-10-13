const readFileSyncAddress =
  process.platform === "linux" ? "/dev/stdin" : "text.txt";

const input = require("fs")
  .readFileSync(readFileSyncAddress)
  .toString()
  .trimEnd()
  .split("\n");

const [N, K] = input[0].split(" ").map(Number);

const tmp = (K * (K + 1) / 2);

if(N < (tmp)) {
    console.log(-1);
    return;
}
const rest = N - tmp;

if(rest % K === 0) {
    console.log(K - 1);
} else {
    console.log(K);
}


