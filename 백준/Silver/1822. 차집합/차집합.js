const readFileSyncAddress =
  process.platform === "linux" ? "/dev/stdin" : "text.txt";

const input = require("fs")
  .readFileSync(readFileSyncAddress)
  .toString()
  .trimEnd()
  .split("\n");

const [aLength, bLength] = input[0].split(" ").map(Number);
const aArr = input[1].split(" ").map(Number)
const bArr = input[2].split(" ").map(Number)

const answerSet = new Set(aArr);

for (const num of bArr) {
  if(answerSet.has(num)) answerSet.delete(num);
}

console.log(`${answerSet.size}${answerSet.size > 0 ? `\n${[...answerSet].sort((a,b) => a - b).join(" ")}` : ''}`);