// find if one element is same or not

const arr1=['a','b','c','d'];
const arr2=['e', 'f','g', 'a'];

function check(arr1,arr2){
for(let i=0; i<arr1.length;i++){
  for(let j=0; j<arr2.length;j++){
    if(arr1[i]===arr2[j]){
      return true;

    }
    // else
    // false;
  }

}
return false
}

check(arr1,arr2);
