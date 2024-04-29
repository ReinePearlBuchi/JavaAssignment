import java.util.Scanner;
public class NokiaMenu3310{
	public static void main(String[] args){	

		String menuPrompt ="""
		Your nokia menu map
		List of menu functions
		Press
		1 -> Phonebook
		2 -> Messages
		3 -> Chat
		4 -> Call register
		5 -> Tones
		6 -> Settings
		7 -> Call divert
		8 -> Games
		9 -> Calculator
		10 -> Reminders
		11 -> Clock
		12 -> Profiles
		13 -> SIM services
		""";
		
			String phoneBookPrompt = """
			
			1 -> Search
			2 -> Service Nos.
			3 -> Add name
			4 -> Erase
			5 -> Edit
			6 -> Assign tone
			7 -> Send b'card
			8 -> Options
			9 -> Speed dials
			10 -> Voice tags
			11 -> Back
			""";
				
				String optionsPrompt = """
			
				1 -> Type of view
				2 -> Memory status
				3 -> Back
				""";

			String messagesPrompt = """
			
			1 -> Write messages
			2 -> Inbox
			3 -> Outbox
			4 -> Picture messages
			5 -> Templates
			6 -> Smileys
			7 -> Message settings
			8 -> Info service
			9 -> Voice mailbox number
			10 -> Service command editor
			11 -> Back
			""";

				String messageSettingsPrompt = """
			
				1 -> Set 1
				2 -> Common
				3 -> Back
				""";
			
					String set1Prompt = """
			
					1 -> Message centre number
					2 -> Message sent as
					3 -> Message validity
					4 -> Back
					""";
	
					String commonPrompt = """
			
					1 -> Delivery reports
					2 -> Reply as same centre
					3 -> Character support
					4 -> Back
					""";
					
			String chatPrompt = """
			
			1 -> Chat
			2 -> Back
			""";


			String callRegisterPrompt = """
			
			1 -> Missed calls
			2 -> Received calls
			3 -> Dialed numbers
			4 -> Erase recent call lists
			5 -> Show call duration
			6 -> Show call costs
			7 -> Call cost settings
			8 -> Prepaid credit
			9 -> Back
			""";
				
					String showCallDurationPrompt =  """
					
					1 -> Last call duration
					2 -> All calls duration
					3 -> Received call duration
					4 -> Dialed call duration
					5 -> Clear timers
					6 -> Back
					""";
				
					String showCallCostsPrompt =  """
					
					1 -> Last call cost
					2 -> All calls cost
					3 -> Clear counters
					4 -> Back
					""";

					String callCostSettingsPrompt =  """
					
					1 -> Call cost limit
					2 -> Show costs in
					3 -> Back
					""";

			String tonesPrompt = """
			
			1 -> Ringing tone
			2 -> Ringing volume
			3 -> Incoming call alert
			4 -> Composer
			5 -> Message alert tone
			6 -> Keypadtones
			7 -> Warning and game tones
			8 -> Vibrating alert
			9 -> Screen saver
			10 -> Back
			""";
			
			String settingsPrompt = """
			
			1 -> Call settings
			2 -> Phone settings
			3 -> Security settings
			4 -> Restore factory settings
			5 -> Back
			""";

					String callSettingsPrompt = """
			
					1 -> Automatic redial
					2 -> Speed dialling
					3 -> Call waiting options
					4 -> Own number sending
					5 -> Phone line in use
					6 -> Automatic answer
					7 -> Back
					""";
					
					String phoneSettingsPrompt = """
			
					1 -> Language
					2 -> Cell info display
					3 -> Welcome note
					4 -> Network selection
					5 -> Lights
					6 -> Confirm SIM service actions
					7 -> Back
					""";
					
					String securitySettingsPrompt = """
			
					1 -> PIN code request
					2 -> Call barring service
					3 -> Fixed dialling
					4 -> Closed user group
					5 -> Phone security
					6 -> Change access codes
					7 -> Back
					""";
					
			String callDivertPrompt = """
			
			1 -> Call divert
			2 -> Back
			""";

			String gamesPrompt = """
			
			1 -> Games
			2 -> Back
			""";

			String calculatorPrompt = """
			
			1 -> Calculator
			2 -> Back
			""";

			String remindersPrompt = """
			
			1 -> Reminders
			2 -> Back
			""";

			String clockPrompt = """
			
			1 -> Alarm clock
			2 -> Clock settings
			3 -> Date settings
			4 -> Stop watch
			5 -> Countdown timer
			6 -> Auto update of date and time
			7 -> Back
			""";
			
			String profilesPrompt = """
			
			1 -> Profiles
			2 -> Back
			""";
		
			
			String simServicesPrompt = """
			
			1 -> Sim services
			2 -> Back
			""";
			

		System.out.println(menuPrompt);
		Scanner buchiInput = new Scanner(System.in);
		int userInput = buchiInput.nextInt();
		
		switch(userInput) {

			case 1-> {
				System.out.println("Phonebook");

					System.out.println(phoneBookPrompt);
					buchiInput = new Scanner(System.in);
					userInput = buchiInput.nextInt();

					switch(userInput) {
						case 1 -> {System.out.println("Search");}
						case 2 -> {System.out.println("Service Nos.");}
						case 3 -> {System.out.println("Add name");}
						case 4 -> {System.out.println("Erase");}
						case 5 -> {System.out.println("Edit");}
						case 6 -> {System.out.println("Assign tone");}
						case 7 -> {System.out.println("Send b'card");}
						case 8 -> {
							System.out.println("Options");

								System.out.println(optionsPrompt);
								buchiInput = new Scanner(System.in);
								userInput = buchiInput.nextInt();

								switch(userInput) {
									case 1 -> {System.out.println("Type of view");}
									case 2 -> {System.out.println("Memory status");}
									case 3 -> {System.out.println(phoneBookPrompt);}
									default -> {System.out.println("Input error");}	
								}
						}

						case 9 -> {System.out.println("Speed dials");}
						case 10 -> {System.out.println("Voice tags");}
						case 11 -> {System.out.println(menuPrompt);}
						default -> {System.out.println("Input error");}	

					}
			}


			case 2-> {
				System.out.println("Messages");

					System.out.println(messagesPrompt);
					buchiInput = new Scanner(System.in);
					userInput = buchiInput.nextInt();
		
					switch(userInput) {

					case 1 -> {System.out.println("Write messages");}
					case 2 -> {System.out.println("Inbox");}
					case 3 -> {System.out.println("Outbox");}
					case 4 -> {System.out.println("Picture messages");}
					case 5 -> {System.out.println("Templates");}
					case 6 -> {System.out.println("Smileys");}
					case 7 -> {
							System.out.println("Message settings");

									System.out.println(messageSettingsPrompt);
									buchiInput = new Scanner(System.in);
									userInput = buchiInput.nextInt();
		
									switch(userInput) {

										case 1 -> 
											{System.out.println("Set 1");

											System.out.println(set1Prompt);
											buchiInput = new Scanner(System.in);
											userInput = buchiInput.nextInt();
		
									switch(userInput) {

											}
										case 1 -> {System.out.println("Message centre number");}
										case 2 -> {System.out.println("Messges sent as");}
										case 3 -> {System.out.println("Message validity");}
										case 4 -> {System.out.println(menuprompt);}
										default -> {System.out.println("input");}
										
									 	case 2 -> 
											{System.out.println("Common");

												System.out.println(commonPrompt);
												buchiInput = new Scanner(System.in);
												userInput = buchiInput.nextInt();
		
									switch(userInput) {

											}
										case 1 -> {System.out.println("Delivery reports");}
										case 2 -> {System.out.println("Reply via same centre");}
										case 3 -> {System.out.println("Character support");}
										case 4 -> {System.out.println(menuprompt);}
										default -> {System.out.println("input");}
									}
					}

					case 8 -> {System.out.println("info service");}
					case 9 -> {System.out.println("Voice mailbox number");}
					case 10 -> {System.out.println("Service command editor");}
					case 11 -> {System.out.println(menuPrompt);}
					default -> {System.out.println("Input error");}
				}

			}

			case 3-> 
				{System.out.println("Chat");}
							case 1 -> {System.out.println(menuprompt);}
							default -> {System.out.println("input");}

			case 4-> {
				System.out.println("Callregister");

					System.out.println(callRegisterPrompt);
					buchiInput = new Scanner(System.in);
					userInput = buchiInput.nextInt();

					switch(userInput) {

					case 1 -> {System.out.println("Missed calls");}
					case 2 -> {System.out.println("Received calls");}
					case 3 -> {System.out.println("Dialed numbers");}
					case 4 -> {System.out.println("Erase recent call lists");}
					case 5 -> 
						{
                         
                          System.out.println("Show call duration");

						System.out.println("showCallDurationPrompt");

							System.out.println(showCallDurationPrompt);
							buchiInput = new Scanner(System.in);
							userInput = buchiInput.nextInt();
		
							switch(userInput) {

								case 1 -> {System.out.println("Last calls duration");}
								case 2 -> {System.out.println("All calls durations");}
								case 3 -> {System.out.println("Received calls duration");}
								case 4 -> {System.out.println("Dialed calls duration");}
								case 5 -> {System.out.println("Clear timers");}
								case 6 -> {System.out.println(menuprompt);}
								default -> {System.out.println("input error");}
							}
				}
					}

					case 6 -> 
						{System.out.println("Show call costs");
							
							System.out.println("showCallDurationPrompt");

							System.out.println(showCallDurationPrompt);
							buchiInput = new Scanner(System.in);
							userInput = buchiInput.nextInt();
		
							switch(userInput) {

								case 1 -> {System.out.println("Last calls cost");}
								case 2 -> {System.out.println("All calls cost");}
								case 3 -> {System.out.println("Clear counters");}
								case 4 -> {System.out.println(menuprompt);}
								default -> {System.out.println("input error");}
						}
							}


					case 7 -> 
						{System.out.println("Call cost settings");
						
						System.out.println("callCostSettingsPrompt");

							System.out.println(callCostSettingsPrompt);
							buchiInput = new Scanner(System.in);
							userInput = buchiInput.nextInt();
		
							switch(userInput) {

								case 1 -> {System.out.println("Call cost limit");}
								case 2 -> {System.out.println("Show costs in");}
								case 3 -> {System.out.println(menuprompt);}
								default -> {System.out.println("input error");}
							}
						

					case 8 -> {System.out.println("PrepaidCredit");}
					case 9 -> {System.out.println("menuprompt");}
					default -> {System.out.println("input error");}
			}



			case 5->
				 {System.out.println("Tones");

					System.out.println(tonesPrompt);
					buchiInput = new Scanner(System.in);
					userInput = buchiInput.nextInt();

					switch(userInput) {
						case 1 -> {System.out.println("Ringing tone");}
						case 2 -> {System.out.println("Ringing volume");}
						case 3 -> {System.out.println("Incoming call alert");}
						case 4 -> {System.out.println("Composer");}
						case 5 -> {System.out.println("Message alert tone");}
						case 6 -> {System.out.println("Warning and game tones");}
						case 7 -> {System.out.println("Vibrating alert");}
						case 8 -> {System.out.println("Screen saver");
						case 9 -> {System.out.println(menuprompt);}
						default -> {System.out.println("input error");
				}

			case 6-> 
				{System.out.println("Settings");
					
					System.out.println(settingsPrompt);
					buchiInput = new Scanner(System.in);
					userInput = buchiInput.nextInt();

					switch(userInput) {
						case 1 -> {
							System.out.println("Call settings");

								{System.out.println("callSettingPrompt");

								System.out.println(callSettingPromptPrompt);
								buchiInput = new Scanner(System.in);
								userInput = buchiInput.nextInt();

								switch(userInput) {
								case 1 -> {System.out.println("Automatic redial");}
								case 2 -> {System.out.println("Speed dialing");}
								case 3 -> {System.out.println("Call waiting options");}
								case 4 -> {System.out.println("Own number seting");}
								case 5 -> {System.out.println("Phone line in use");}
								case 6 -> {System.out.println("Automatic answer");}
								case 7 -> {System.out.println(menuprompt);}
								default -> {System.out.println("Screen saver");
							}
						}


						case 2 -> 
							{System.out.println("Phone settings");
							
							{System.out.println("phoneSettingsPrompt");

								System.out.println(phoneSettingsPromptPrompt);
								buchiInput = new Scanner(System.in);
								userInput = buchiInput.nextInt();

								switch(userInput) {
								case 1 -> {System.out.println("Language");}
								case 2 -> {System.out.println("Cell info display");}
								case 3 -> {System.out.println("Welcome note");}
								case 4 -> {System.out.println("Network selection");}
								case 5 -> {System.out.println("Lights");}
								case 6 -> {System.out.println("Confirm SIM service action");}
								case 7 -> {System.out.println(menuprompt);}
								default -> {System.out.println("input error");
							}
						}

	
								

		
					}
						case 3 -> 
								{System.out.println("Security settings");

								{System.out.println("securitySettingsPrompt");

								System.out.println(securitySettingsPrompt);
								buchiInput = new Scanner(System.in);
								userInput = buchiInput.nextInt();

								switch(userInput) {
								case 1 -> {System.out.println("PIN code request");}
								case 2 -> {System.out.println("Call barring service");}
								case 3 -> {System.out.println("Fixed dialing");}
								case 4 -> {System.out.println("Closed user group");}
								case 5 -> {System.out.println("Phone user group");}
								case 6 -> {System.out.println("Phone security");}
								case 7 -> {System.out.println("Change access code");}
								case 8 -> {System.out.println(menuprompt);
								default -> {System.out.println("input error");
							}
						}

								}


						case 4 -> {System.out.println("Restore factory settings");}
						case 5 -> {System.out.println(menuprompt);}
						default -> {System.out.println("input error");}
						
			}


			case 7-> {System.out.println("Call divert");}

			case 8-> {System.out.println("Games");}

			case 9-> {System.out.println("Calculator");}

			case 10-> {System.out.println("Reminders");}

			case 11->
				 {
					System.out.println("Clock");


							System.out.println("clockPrompt");

							System.out.println(clockPrompt);
							buchiInput = new Scanner(System.in);
							userInput = buchiInput.nextInt();

								switch(userInput) {
									case 1 -> {System.out.println("Alarm clock");}
									case 2 -> {System.out.println("Clock settings");}
									case 3 -> {System.out.println("Date settings");}
									case 4 -> {System.out.println("Stopwatch");}
									case 5 -> {System.out.println("Countdown timer");}
									case 6 -> {System.out.println("Auto update of date and time");}
									case 7 -> {System.out.println(menuprompt);
									default -> {System.out.println("input error");
								}
			}


			case 12-> {System.out.println("Profiles");}

			case 13-> {System.out.println("SIM services");}
			case 14 -> {System.out.println(menuprompt);}
			default -> {System.out.println("Input error");}
		
}
			
			
		
	}
	}
}