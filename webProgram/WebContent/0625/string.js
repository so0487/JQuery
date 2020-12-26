var str = "I love you";
var str2 = ", 손대성";

function proc1(){
	var n = str.charAt(3);	
	/*console.log(n);*/
	document.getElementById("result").innerHTML = n;
}
function proc2(){
	var n = str.charCodeAt(0);	
	document.getElementById("result").innerHTML = n;	
}

function proc3(){
	var n = str.indexOf("o");
	n = str.indexOf("o",4);
	
	document.getElementById("result").innerHTML = n;
}
function proc4(){
	var n = str.lastIndexOf("k");	
	document.getElementById("result").innerHTML = n;
}
function proc5(){
	str = str.concat(str2); 
	
	document.getElementById("result").innerHTML = str;	
}
function proc6(){
	var spaceStr = "    s p a c e    ";
	spaceStr = spaceStr.trim();
	
	document.getElementById("result").innerHTML
	= spaceStr;
}
function proc7(){
	document.getElementById("result").innerHTML 
	= str.toLowerCase();
}

function proc8(){
	document.getElementById("result").innerHTML 
	= str.toUpperCase();
}

function proc9(){
	document.getElementById("result").innerHTML
	= str.substring(3, 6);
}

function proc10(){
	document.getElementById("result").innerHTML
	//= str.slice(3, 6);
	= str.slice(-3);
}
function proc11(){
	
	var str = "1&2&3&4&5";
	
	var strArr = str.split("&");
	document.getElementById("result").innerHTML
	= strArr;
	
	for(var i in strArr){
		console.log(strArr[i]);
	}
	
	
}






