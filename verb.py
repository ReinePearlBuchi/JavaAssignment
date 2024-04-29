def verbing(s):
	if len(s) >= 3:
		if s.endwith("ing"):
			s += "ly"
	else:
		s += "ing"
	return s