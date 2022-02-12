// consider 5 items in a array and log all pairs in items


const boxes= ['a','b','c','d','e'];

for(let i=0; i<boxes.length; i++){

  for(let j=0;j<boxes.length; j++){
 console.log(boxes[i],boxes[j]);

  }


}

//O(n^2) for nested loop
