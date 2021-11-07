with open("data.csv",'r')as myfile:
	with open("text.tsv",'w')as tsv_file:
		for line in myfile:
			file   Content=re.sub(",","\t",line)
			tsv_file.write(fileContent)
