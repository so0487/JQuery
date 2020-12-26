/*
 * 	문제1)prompt를 이용하여 가고 싶은 여행지를 입력받아 배열에 저장 후 출력
 *  :: 종료는 공백이 들어갔을 때 prompt창을 중지한다.
 * 
 */





/*
arr = new Array();
var i=0;

do {
	arr[i] = prompt("여행지를 입력하세요");
} while (arr[i++]!="");
document.write(arr);

*/



/*
 * 문제2) prompt로 숫자를 입력받고 짝수번째의 합, 홀수번째의 합을 출력한다.
 * 			(짝수 홀수는 index를 기준으로)
 * 		::종료는 공백이 들어갔을 때 prompt입력을 중지한다.
 * 
 **/
var arr = new Array();
var i=0;
var sum1=0;
var sum2=0;

	do{
		arr[i]=prompt("숫자를 입력하세요");
		
		
		if(arr%2==0){
			sum1+=parseInt(arr);
		}else{
			sum2+=parseInt(arr);
		}
		
	}while(arr[i]!=0);
	


document.write("짝수의 합"+sum1+"<br>");
document.write("홀수의 합"+sum2);


/*문제3) 프로그래머스 코딩테스트 : 같은 숫자는 싫어*/
