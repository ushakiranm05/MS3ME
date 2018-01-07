API Details : 


1 : Call to get HTTP page for inputs :
		URL : host:8081/
		Response:
			HTML page to enter values
2 : Pass the entered values to ap api and call Algorithm to convert the input to string
		URL : host:8081/get-result
		Query params : lower,higher
		Response : 
			HTML RESULT Page 
3 : Algorithm API call : 
		URL : host:8081/convert-integer
		Query params : lower,higher
		Response : 
			json result  