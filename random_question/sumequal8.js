// given an array now return true  if sum of any two element=8
const array1=[1,2,3,4];
const array2=[4,5,6,7];
function sumequal8(array1, array2){

for(let i=0; i<array1.length; i++){
 for(let j=0; j<array2.length; j++){
   if(array1[i]+array2[j]==8){
     return true;
   }
   else
   return false;
 }


}
}

sumequal8(array1,array2);
