var arr = new Array();	//배열선언


//배열 안에 모든 형식이 가능하다

arr[5] = "유동준";
arr[9] = 1.1;
arr[20] = true;


document.write(arr);

for(var i in arr){
	document.write("<br>"+arr[i]);
}