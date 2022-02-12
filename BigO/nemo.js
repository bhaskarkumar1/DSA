
// const nemo = ['nemo','dorry'];
const large=new Array(100000).fill('nemo');  //fill all 100 item created with nemo

function findNemo1(array) {
  let t0= performance.now(); //for starting timer
  for (let i = 0; i < array.length; i++) {
    if (array[i] === 'nemo') {
      console.log('Found NEMO!');
    }
  }
  let t1= performance.now(); //checking timer at this moment
  console.log('call to find Nemo took '+ (t1-t0)+ '  milliseconds');
}

// findNemo1(nemo);
findNemo1(large);
// const nemo = ['nemo','dorry'];
const large=new Array(100000).fill('nemo');  //fill all 100 item created with nemo

function findNemo1(array) {
  let t0= performance.now(); //for starting timer
  for (let i = 0; i < array.length; i++) {
    if (array[i] === 'nemo') {
      console.log('Found NEMO!');
    }
  }
  let t1= performance.now(); //checking timer at this moment
  console.log('call to find Nemo took '+ (t1-t0)+ '  milliseconds');
}

// findNemo1(nemo);
findNemo1(large); 
