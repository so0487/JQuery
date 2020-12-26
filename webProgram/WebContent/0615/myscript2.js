/*
	자료형
	수치형(number) 	: 정수나 실수
	문자형(string) 	: 문자가 연결된 것, ""나 ''로 표시
	부울형(boolean)	: true 또는 false
	객체형(object)	: 객체를 나타내는 타입
	undefined		: 값이 정해지지 않은 상태	
 * */

var x;	//변수 선언
//x="hello world";
//alert(x);	//초기화 되지 않았을 경우 undefined값이 출력됨



var x = 1;	//number형		//같은 변수를 여러 번 선언 할 경우 가장 밑에 있는 값으로 저장
var y="1";	//string형

/*
alert(x+","+y);	//string형(문자+숫자=문자)
alert(typeof x);//number
alert(typeof y);//string
*/

/*
var bool=true;
bool=false;
alert(bool);
*/

var str="global";	//전역변수

function print() {
/*	
	alert(str);
	var str="inner";	//지역변수--> 지역변수가 우선 출력
	//alert(str);
	
	//var str2="inner2";	//출력이 되지 않음
	str2="inner2";			//함수 내에서 var을 사용하면 지역변수, var을 사용하지 않으면 전역변수로 선언된다.
	alert(str);
	*/
}
//함수를 호출하기 전까지 출력되지 않는다.


print();	//함수호출
alert(str2);

