// print the all elementand then sum of all pairs numbers of arrays
function printAllnumbersthenAlllPairSum(arrays) {
console.log("these are numbers: ");
arrays.forEach(function(array){
console.log(array);
});


console.log('these are there sum: ');
arrays.forEach(function(firstNumber){
  arrays.forEach(function(secondNumber){
    console.log(firstNumber+secondNumber);
  });
});
}

printAllnumbersthenAlllPairSum([0,1,2,3,4,5,6,7,8,9])

// O(n+ n^2)
//  O(n^2)