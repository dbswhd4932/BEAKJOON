
# ✍️알고리즘을 풀면서 기록하기✍️


### NO11654 (상수) <br>
int형 숫자 뒤집기 <br>
⇒ 숫자 입력받아서 Stringbuilder로 받고 다시 정수형으로 변환 <br>
Integer.parseInt(new StirngBuilder().append().Reverse().toString()); <br>
EX) 743 -> 347 / 893 -> 398 <br>

### NO11654 (아스키코드) <br>
문자열 입력받아서 아스키코드 값으로 나타내기  <br>
한글자만 아스키 코드값으로 나타내면된다.  <br>
int answer = s.charAt(0);  <br>

### NO11720 (숫자의합) <br>
next와 nextLine 의 차이를 확인하자. <br>
next는 개행문자를 무시하고 nextLine 은 개행문자를 포함한다. <br>

### NO10809 (알파벳찾기) <br>
굳이 toCharArray 를 사용해서 char 배열로 바꾸지 않아도 되는 상황에는 <br>
String타입에서 문자를 하나하나 비교할때는 CharAt() 을 사용하면 된다. <br>

### NO10162 (전자레인지) <br>
그리디알고리즘에 대해 접근하고자 입문 문제 풀이 <br>
<매 선택에서 지금 이 순간 당장 최적의 답을 선택하여 적합한 결과를 도출하자> <br>
if 문을 적절히 사용해서 주어진 값이 나오게 되면 모든 값을 출력하고, <br>
주어진 결과값이 나오는 경우의 수가 없으면 -1를 리턴. <br>

### NO2442 (별 찍기 -5) <br>
별찍기는 공식이 정해져있는 것 같다<br>
익숙해지기 <br>

### NO11721 (열 개씩 끊어 출력하기) <br>
for문을 통해 푸는데 10개씩 끊어야 하므로 증감식을 잘 확인해야한다 <br>
for (int i = 0; i < s.length(); i += 10) <br>
또한 문자열을 나눠서 출력해야하기 때문에 subString을 적절히 사용해야한다 <br>
System.out.println(s.substring(i)); -> i 번째부터 끝까지 출력 <br>
System.out.println(s.substring(i, i + 10)); -> i 번째부터 i + 10 까지 출력(마지막은 제외) <br>
