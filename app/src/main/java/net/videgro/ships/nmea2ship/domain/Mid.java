package net.videgro.ships.nmea2ship.domain;

/**
 * This class contains the Maritime identification digits
 * 
 * More info: https://en.wikipedia.org/wiki/Maritime_identification_digits
 */
public enum Mid {
	MID_201("Albania","al"),
	MID_202("Andorra","ad"),
	MID_203("Austria","at"),
	MID_204("Azores","pt"),
	MID_205("Belgium","be"),
	MID_206("Belarus","by"),
	MID_207("Bulgaria","bg"),
	MID_208("Vatican City State","va"),
	MID_209("Cyprus","cy"),
	MID_210("Cyprus","cy"),
	MID_211("Germany","de"),
	MID_212("Cyprus","cy"),
	MID_213("Georgia","ge"),
	MID_214("Moldova","md"),
	MID_215("Malta","mt"),
	MID_216("Armenia","am"),
	MID_218("Germany","de"),
	MID_219("Denmark","dk"),
	MID_220("Denmark","dk"),
	MID_224("Spain","es"),
	MID_225("Spain","es"),
	MID_226("France","fr"),
	MID_227("France","fr"),
	MID_229("Malta","mt"),
	MID_230("Finland","fi"),
	MID_231("Faroe Islands","fo"),
	MID_232("United Kingdom","gb"),
	MID_233("United Kingdom","gb"),
	MID_234("United Kingdom","gb"),
	MID_235("United Kingdom","gb"),
	MID_236("Gibraltar","gi"),
	MID_237("Greece","gr"),
	MID_238("Croatia","hr"),
	MID_239("Greece","gr"),
	MID_240("Greece","gr"),
	MID_241("Greece","gr"),
	MID_242("Morocco","ma"),
	MID_243("Hungary","hu"),
	MID_244("Netherlands","nl"),
	MID_245("Netherlands","nl"),
	MID_246("Netherlands","nl"),
	MID_247("Italy","it"),
	MID_248("Malta","mt"),
	MID_249("Malta","mt"),
	MID_250("Ireland","ie"),
	MID_251("Iceland","is"),
	MID_252("Liechtenstein","li"),
	MID_253("Luxembourg","lu"),
	MID_254("Monaco","mc"),
	MID_255("Madeira","pt"),
	MID_256("Malta","mt"),
	MID_257("Norway","no"),
	MID_258("Norway","no"),
	MID_259("Norway","no"),
	MID_261("Poland","pl"),
	MID_262("Montenegro","me"),
	MID_263("Portugal","pt"),
	MID_264("Romania","ro"),
	MID_265("Sweden","se"),
	MID_266("Sweden","se"),
	MID_267("Slovak Republic","sk"),
	MID_268("San Marino","sm"),
	MID_269("Switzerland","ch"),
	MID_270("Czech Republic","cz"),
	MID_271("Turkey","tr"),
	MID_272("Ukraine","ua"),
	MID_273("Russia","ru"),
	MID_274("Macedonia","mk"),
	MID_275("Latvia","lv"),
	MID_276("Estonia","ee"),
	MID_277("Lithuania","lt"),
	MID_278("Slovenia","si"),
	MID_279("Serbia","rs"),
	MID_301("Anguilla","ai"),
	MID_303("Alaska","us"),
	MID_304("Antigua and Barbuda","ag"),
	MID_305("Antigua and Barbuda","ag"),
	MID_306("Antilles","cw"),
	MID_307("Aruba","aw"),
	MID_308("Bahamas","bs"),
	MID_309("Bahamas","bs"),
	MID_310("Bermuda","bm"),
	MID_311("Bahamas","bs"),
	MID_312("Belize","bz"),
	MID_314("Barbados","bb"),
	MID_316("Canada","ca"),
	MID_319("Cayman Islands","ky"),
	MID_321("Costa Rica","cr"),
	MID_323("Cuba","cu"),
	MID_325("Dominica","dm"),
	MID_327("Dominican Republic","do"),
	MID_329("Guadeloupe","gp"),
	MID_330("Grenada","gd"),
	MID_331("Greenland","gl"),
	MID_332("Guatemala","gt"),
	MID_335("Honduras","hn"),
	MID_336("Haiti","ht"),
	MID_338("United States of America","us"),
	MID_339("Jamaica","jm"),
	MID_341("Saint Kitts and Nevis","kn"),
	MID_343("Saint Lucia","lc"),
	MID_345("Mexico","mx"),
	MID_347("Martinique","mq"),
	MID_348("Montserrat","ms"),
	MID_350("Nicaragua","ni"),
	MID_351("Panama","pa"),
	MID_352("Panama","pa"),
	MID_353("Panama","pa"),
	MID_354("Panama","pa"),
	MID_358("Puerto Rico","pr"),
	MID_359("El Salvador","sv"),
	MID_361("Saint Pierre and Miquelon","pm"),
	MID_362("Trinidad and Tobago","tt"),
	MID_364("Turks and Caicos Islands","tc"),
	MID_366("United States of America","us"),
	MID_367("United States of America","us"),
	MID_368("United States of America","us"),
	MID_369("United States of America","us"),
	MID_370("Panama","pa"),
	MID_371("Panama","pa"),
	MID_372("Panama","pa"),
	MID_373("Panama","pa"),
	MID_375("Saint Vincent and the Grenadines","vc"),
	MID_376("Saint Vincent and the Grenadines","vc"),
	MID_377("Saint Vincent and the Grenadines","vc"),
	MID_378("British Virgin Islands","vg"),
	MID_379("United States Virgin Islands","vi"),
	MID_401("Afghanistan","af"),
	MID_403("Saudi Arabia","sa"),
	MID_405("Bangladesh","bd"),
	MID_408("Bahrain","bh"),
	MID_410("Bhutan","bt"),
	MID_412("China","cn"),
	MID_413("China","cn"),
	MID_414("China","cn"),
	MID_416("Taiwan","tw"),
	MID_417("Sri Lanka","lk"),
	MID_419("India","in"),
	MID_422("Iran","ir"),
	MID_423("Azerbaijan","az"),
	MID_425("Iraq","iq"),
	MID_428("Israel","il"),
	MID_431("Japan","jp"),
	MID_432("Japan","jp"),
	MID_434("Turkmenistan","tm"),
	MID_436("Kazakhstan","kz"),
	MID_437("Uzbekistan","uz"),
	MID_438("Jordan","jo"),
	MID_440("Korea","kr"),
	MID_441("Korea","kr"),
	MID_443("State of Palestine","ps"),
	MID_445("Democratic People's Republic of Korea","kp"),
	MID_447("Kuwait","kw"),
	MID_450("Lebanon","lb"),
	MID_451("Kyrgyz Republic","kg"),
	MID_453("Macao","mo"),
	MID_455("Maldives","mv"),
	MID_457("Mongolia","mn"),
	MID_459("Nepal","np"),
	MID_461("Oman","om"),
	MID_463("Pakistan","pk"),
	MID_466("Qatar (State of)","qa"),
	MID_468("Syrian Arab Republic","sy"),
	MID_470("United Arab Emirates","ae"),
	MID_472("Tajikistan","tj"),
	MID_473("Yemen","ye"),
	MID_475("Yemen","ye"),
	MID_477("Hong Kong","hk"),
	MID_478("Bosnia and Herzegovina","ba"),
	MID_501("Adelie Land","fr"),
	MID_503("Australia","au"),
	MID_506("Myanmar","mm"),
	MID_508("Brunei Darussalam","bn"),
	MID_510("Micronesia","fm"),
	MID_511("Palau","pw"),
	MID_512("New Zealand","nz"),
	MID_514("Cambodia","kh"),
	MID_515("Cambodia","kh"),
	MID_516("Christmas Island","cx"),
	MID_518("Cook Islands","ck"),
	MID_520("Fiji","fj"),
	MID_523("Cocos (Keeling) Islands","cc"),
	MID_525("Indonesia","id"),
	MID_529("Kiribati","ki"),
	MID_531("Lao People's Democratic Republic","la"),
	MID_533("Malaysia","my"),
	MID_536("Northern Mariana Islands","mp"),
	MID_538("Marshall Islands","mh"),
	MID_540("New Caledonia","nc"),
	MID_542("Niue","nu"),
	MID_544("Nauru","nr"),
	MID_546("French Polynesia","pf"),
	MID_548("Philippines","ph"),
	MID_553("Papua New Guinea","pg"),
	MID_555("Pitcairn Island","pn"),
	MID_557("Solomon Islands","sb"),
	MID_559("American Samoa","as"),
	MID_561("Samoa","ws"),
	MID_563("Singapore","sg"),
	MID_564("Singapore","sg"),
	MID_565("Singapore","sg"),
	MID_566("Singapore","sg"),
	MID_567("Thailand","th"),
	MID_570("Tonga","to"),
	MID_572("Tuvalu","tv"),
	MID_574("Viet Nam","vn"),
	MID_576("Vanuatu","vu"),
	MID_577("Vanuatu","vu"),
	MID_578("Wallis and Futuna Islands","wf"),
	MID_601("South Africa","za"),
	MID_603("Angola","ao"),
	MID_605("Algeria","dz"),
	MID_607("Saint Paul and Amsterdam Islands","fr"),
	MID_608("Ascension Island","gb"),
	MID_609("Burundi","bi"),
	MID_610("Benin","bj"),
	MID_611("Botswana","bw"),
	MID_621("Djibouti","dj"),
	MID_613("Cameroon","cm"),
	MID_615("Congo","cg"),
	MID_616("Comoros","km"),
	MID_617("Cabo Verde","cv"),
	MID_618("Crozet Archipelago","fr"),
	MID_619("Ivory Coast","ci"),
	MID_620("Comoros","km"),
	MID_622("Egypt","eg"),
	MID_624("Ethiopia","et"),
	MID_625("Eritrea","er"),
	MID_626("Gabonese Republic","ga"),
	MID_627("Ghana","gh"),
	MID_629("Gambia","gm"),
	MID_630("Guinea-Bissau","gw"),
	MID_631("Equatorial Guinea","gq"),
	MID_632("Guinea","gn"),
	MID_633("Burkina Faso","bf"),
	MID_634("Kenya","ke"),
	MID_635("Kerguelen Islands","fr"),
	MID_636("Liberia","lr"),
	MID_637("Liberia","lr"),
	MID_638("South Sudan","ss"),
	MID_642("Libya","ly"),
	MID_644("Lesotho","ls"),
	MID_645("Mauritius","mu"),
	MID_647("Madagascar","mg"),
	MID_649("Mali","ml"),
	MID_650("Mozambique","mz"),
	MID_654("Mauritania","mr"),
	MID_655("Malawi","mw"),
	MID_656("Nigeria","ng"),
	MID_659("Namibia","na"),
	MID_660("Reunion","re"),
	MID_661("Rwanda","rw"),
	MID_662("Sudan","sd"),
	MID_663("Senegal","sn"),
	MID_664("Seychelles","sc"),
	MID_665("Saint Helena","sh"),
	MID_666("Somali Democratic Republic","so"),
	MID_667("Sierra Leone","sl"),
	MID_668("Sao Tome and Principe","st"),
	MID_669("Swaziland","sz"),
	MID_670("Chad","td"),
	MID_671("Togolese Republic","tg"),
	MID_672("Tunisian Republic","tn"),
	MID_674("Tanzania","tz"),
	MID_675("Uganda","ug"),
	MID_676("Democratic Republic of the Congo","cd"),
	MID_677("Tanzania","tz"),
	MID_678("Zambia","zm"),
	MID_679("Zimbabwe","zw"),
	MID_701("Argentine Republic","ar"),
	MID_710("Brazil","br"),
	MID_720("Bolivia","bo"),
	MID_725("Chile","cl"),
	MID_730("Colombia","co"),
	MID_735("Ecuador","ec"),
	MID_740("Falkland Islands","fk"),
	MID_745("Guiana","gf"),
	MID_750("Guyana","gy"),
	MID_755("Paraguay","py"),
	MID_760("Peru","pe"),
	MID_765("Suriname","sr"),
	MID_770("Uruguay","uy"),
	MID_775("Venezuela","ve");

	public static final String PREFIX="MID_";

	private final String friendlyName;
	private final String flagCode;

	private Mid(String friendlyName,String flagCode){
		this.friendlyName=friendlyName;
		this.flagCode=flagCode;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public String getFlagCode() {
		return flagCode;
	}
}
