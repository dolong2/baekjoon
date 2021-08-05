const readLine = require('readline');
const rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.on('line',(line)=>{
    main(line);
    rl.close();
}).on('close', () => {
    process.exit();
});
function main(input){
    var n=input.split(':');
    n[0]=Number(n[0])
    n[1]=Number(n[1])
    let gcd_v=gcd(n[0],n[1]);
    let str=n[0]/gcd_v+":"+n[1]/gcd_v;
    console.log(str);
}
function gcd(n,m){
    var temp;
    if(m>n){
      temp=m;
      m=n;
      n=temp;
    }
    while(m!=0){
      temp=n%m;
      n=m;
      m=temp;
    }
    return n;
}