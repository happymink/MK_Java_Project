# MK_Java_Project
😊😊자바 실습 자판기 만들기😊😊


-프로그램 동작 환경 : Windows 또는 Linux/Unix
-사용 컴파일러 : 프로그램 동작 환경에 적합한 컴파일러
-사용 언어 : Socket 프로그래밍을 적용/활용할 수 있고, 상기한 컴파일러에서 지원하는
언어


🥇 -기능 요구사항 :

◻ 판매하는 음료의 개수는 기본적으로 5개로 하되, 각각 450원(물), 500원(커피), 550원
(이온음료), 700원(고급커피), 750원 (탄산음료)로 한다 (반드시 클래스 사용).
◻ 각각 음료의 재고는 기본적으로 3개로 하며(생성자로 초기화), 3개 이상 음료가 배출
되었을 때는 해당 음료 (물품)에 대해 품절 표시를 하고 해당 음료를 더 이상 선택할
수 없어야 한다 (단, 이전에 재고가 보충되었을 경우에는 해당 재고만큼의 판매가 가능
해야 함).

◻ 입력 받을 수 있는 화폐의 단위는 10원, 50원, 100원, 500원, 1,000원으로만 한정하
되, 지폐로 입력 받을 수 있는 금액의 상한선은 3,000원까지이며, 지폐와 동전을 모두
포함하여 총 5,000원을 초과하여 입력 받을 수 없다 (화폐의 입력 금액에 따라 판매 가
능 음료가 표기되어야 한다). 이 때, 화폐를 입력 받는 변수는 반드시 동적 할당을 통
한 레퍼런스화 해야 하며, 화폐가 반환되거나 음료의 판매가 끝나면 동적 할당을 해제
해야 한다.

◻ 기본적으로 거스름 돈을 가지고 있어야 하며 (각 동전별로 5개를 기본 값으로 하고 음
료의 개수와 마찬가지로 생성자를 사용하여 초기화 할 것), 거스름 돈 반환 혹은 음료
판매에 따른 동전의 가감이 구현되어야 한다. 또한 음료 자판기에서 화폐를 입력 받을
때는 반드시 사용자 요구에 의한 화폐 반환이 가능해야 한다.

◻ 음료가 배출된 이후에도 반드시 다시 화폐를 입력 받을 수 있는 상태가 되어야 한다.

◻ 관리자 메뉴 (비밀번호 확인을 통해 관리자 메뉴에 접근할 수 있도록 작성하되, 비밀
번호는 반드시 특수문자 및 숫자가 하나 이상 포함된 8자리 이상으로 설정할 수 있도
록 해야 하며 필요시 언제든 변경 가능해야 함)는 다음과 같은 조건을 만족해야 한다.
- 일별/월별 매출 산출, 각 음료의 일별/월별 매출, 각 음료의 재고 보충이 가능해야
한다. 이 때, 일별/월별 매출은 사전에 파일로 저장해 놓은 파일(각자 만들어 사용)을
사용하여야 하며, 현재의 자판기 매출은 사전에 저장해 놓은 파일과 연관성을 가지고
있어야 한다.

- 관리자 메뉴에서는 현재 자판기 내의 화폐현황을 손쉽게 파악할 수 있어야 하며, 관리자가 “수금”이란 메뉴를 선택할 경우, 해당 금액을 수금할 수 있어야 한다. 단, 이
경우에도 반환을 위한 최소한의 화폐 (임의로 지정할 것)는 남겨두어야 한다.
- 관리자 메뉴에서는 각 음료의 판매가격, 판매이름을 사용자의 입력을 통해 언제든 바
꿀 수 있어야 한다.
- 관리자 메뉴와 관련된 모든 사항들은 파일로 읽기/쓰기가 되어야 한다. (최소 기록
사항: 일별/월별 매출, 재고 소진 날짜 혹은 주기)
◻ 반드시 예외 처리 및 주석 (프로그램, 함수, 라인 주석 등)이 반드시 포함되어야 한다.
◻ 예외처리시 JAVA 언어의 예외처리 방식에 따른 동작을 사용해야 하며, 모든 부분에
예외처리가 잘 이루어져야 한다.
◻ 상기한 바와 같은 프로그램의 실행은 모두 GUI 환경에서 동작하여야 한다.

===============================================================================
![자판기 화면](https://user-images.githubusercontent.com/71982555/102096400-ffda9200-3e67-11eb-8e58-e7cc84fe83eb.JPG)
![동전 투입기 화면](https://user-images.githubusercontent.com/71982555/102096693-55af3a00-3e68-11eb-9430-09f637f87c82.JPG)

![인벤토리 화면](https://user-images.githubusercontent.com/71982555/102096747-652e8300-3e68-11eb-9240-2e5c7dec62bf.JPG)
![동전 투입기 화면](https://user-images.githubusercontent.com/71982555/102096709-5d6ede80-3e68-11eb-9cc0-b28f64cc0bae.JPG)

![판매현황 화면](https://user-images.githubusercontent.com/71982555/102096790-711a4500-3e68-11eb-914a-96d7f05e1069.JPG)
![메뉴 수정 화면](https://user-images.githubusercontent.com/71982555/102096819-7aa3ad00-3e68-11eb-935a-1742d00780ca.JPG)

