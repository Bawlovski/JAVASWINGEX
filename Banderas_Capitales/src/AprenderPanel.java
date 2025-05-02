import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class AprenderPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    
    // Complete country data by continent
    public static final String[][] AMERICA = {
        {"Antigua and Barbuda", "ag", "St. John's"},
        {"Argentina", "ar", "Buenos Aires"},
        {"Bahamas", "bs", "Nassau"},
        {"Barbados", "bb", "Bridgetown"},
        {"Belize", "bz", "Belmopan"},
        {"Bolivia", "bo", "Sucre/La Paz"},
        {"Brazil", "br", "Brasília"},
        {"Canada", "ca", "Ottawa"},
        {"Chile", "cl", "Santiago"},
        {"Colombia", "co", "Bogotá"},
        {"Costa Rica", "cr", "San José"},
        {"Cuba", "cu", "Havana"},
        {"Dominica", "dm", "Roseau"},
        {"Dominican Republic", "do", "Santo Domingo"},
        {"Ecuador", "ec", "Quito"},
        {"El Salvador", "sv", "San Salvador"},
        {"Grenada", "gd", "St. George's"},
        {"Guatemala", "gt", "Guatemala City"},
        {"Guyana", "gy", "Georgetown"},
        {"Haiti", "ht", "Port-au-Prince"},
        {"Honduras", "hn", "Tegucigalpa"},
        {"Jamaica", "jm", "Kingston"},
        {"Mexico", "mx", "Mexico City"},
        {"Nicaragua", "ni", "Managua"},
        {"Panama", "pa", "Panama City"},
        {"Paraguay", "py", "Asunción"},
        {"Peru", "pe", "Lima"},
        {"Saint Kitts and Nevis", "kn", "Basseterre"},
        {"Saint Lucia", "lc", "Castries"},
        {"Saint Vincent and Grenadines", "vc", "Kingstown"},
        {"Suriname", "sr", "Paramaribo"},
        {"Trinidad and Tobago", "tt", "Port of Spain"},
        {"United States", "us", "Washington, D.C."},
        {"Uruguay", "uy", "Montevideo"},
        {"Venezuela", "ve", "Caracas"}
    };
    
    public static final String[][] EUROPE = {
        {"Albania", "al", "Tirana"},
        {"Andorra", "ad", "Andorra la Vella"},
        {"Austria", "at", "Vienna"},
        {"Belarus", "by", "Minsk"},
        {"Belgium", "be", "Brussels"},
        {"Bosnia and Herzegovina", "ba", "Sarajevo"},
        {"Bulgaria", "bg", "Sofia"},
        {"Croatia", "hr", "Zagreb"},
        {"Cyprus", "cy", "Nicosia"},
        {"Czech Republic", "cz", "Prague"},
        {"Denmark", "dk", "Copenhagen"},
        {"Estonia", "ee", "Tallinn"},
        {"Finland", "fi", "Helsinki"},
        {"France", "fr", "Paris"},
        {"Germany", "de", "Berlin"},
        {"Greece", "gr", "Athens"},
        {"Hungary", "hu", "Budapest"},
        {"Iceland", "is", "Reykjavik"},
        {"Ireland", "ie", "Dublin"},
        {"Italy", "it", "Rome"},
        {"Latvia", "lv", "Riga"},
        {"Liechtenstein", "li", "Vaduz"},
        {"Lithuania", "lt", "Vilnius"},
        {"Luxembourg", "lu", "Luxembourg"},
        {"Malta", "mt", "Valletta"},
        {"Moldova", "md", "Chisinau"},
        {"Monaco", "mc", "Monaco"},
        {"Montenegro", "me", "Podgorica"},
        {"Netherlands", "nl", "Amsterdam"},
        {"North Macedonia", "mk", "Skopje"},
        {"Norway", "no", "Oslo"},
        {"Poland", "pl", "Warsaw"},
        {"Portugal", "pt", "Lisbon"},
        {"Romania", "ro", "Bucharest"},
        {"Russia", "ru", "Moscow"},
        {"San Marino", "sm", "San Marino"},
        {"Serbia", "rs", "Belgrade"},
        {"Slovakia", "sk", "Bratislava"},
        {"Slovenia", "si", "Ljubljana"},
        {"Spain", "es", "Madrid"},
        {"Sweden", "se", "Stockholm"},
        {"Switzerland", "ch", "Bern"},
        {"Ukraine", "ua", "Kyiv"},
        {"United Kingdom", "gb", "London"},
        {"Vatican City", "va", "Vatican City"}
    };
    
    public static final String[][] ASIA = {
        {"Afghanistan", "af", "Kabul"},
        {"Armenia", "am", "Yerevan"},
        {"Azerbaijan", "az", "Baku"},
        {"Bahrain", "bh", "Manama"},
        {"Bangladesh", "bd", "Dhaka"},
        {"Bhutan", "bt", "Thimphu"},
        {"Brunei", "bn", "Bandar Seri Begawan"},
        {"Cambodia", "kh", "Phnom Penh"},
        {"China", "cn", "Beijing"},
        {"Georgia", "ge", "Tbilisi"},
        {"India", "in", "New Delhi"},
        {"Indonesia", "id", "Jakarta"},
        {"Iran", "ir", "Tehran"},
        {"Iraq", "iq", "Baghdad"},
        {"Israel", "il", "Jerusalem"},
        {"Japan", "jp", "Tokyo"},
        {"Jordan", "jo", "Amman"},
        {"Kazakhstan", "kz", "Nur-Sultan"},
        {"Kuwait", "kw", "Kuwait City"},
        {"Kyrgyzstan", "kg", "Bishkek"},
        {"Laos", "la", "Vientiane"},
        {"Lebanon", "lb", "Beirut"},
        {"Malaysia", "my", "Kuala Lumpur"},
        {"Maldives", "mv", "Malé"},
        {"Mongolia", "mn", "Ulaanbaatar"},
        {"Myanmar", "mm", "Naypyidaw"},
        {"Nepal", "np", "Kathmandu"},
        {"North Korea", "kp", "Pyongyang"},
        {"Oman", "om", "Muscat"},
        {"Pakistan", "pk", "Islamabad"},
        {"Palestine", "ps", "Ramallah"},
        {"Philippines", "ph", "Manila"},
        {"Qatar", "qa", "Doha"},
        {"Saudi Arabia", "sa", "Riyadh"},
        {"Singapore", "sg", "Singapore"},
        {"South Korea", "kr", "Seoul"},
        {"Sri Lanka", "lk", "Colombo"},
        {"Syria", "sy", "Damascus"},
        {"Taiwan", "tw", "Taipei"},
        {"Tajikistan", "tj", "Dushanbe"},
        {"Thailand", "th", "Bangkok"},
        {"Timor-Leste", "tl", "Dili"},
        {"Turkey", "tr", "Ankara"},
        {"Turkmenistan", "tm", "Ashgabat"},
        {"United Arab Emirates", "ae", "Abu Dhabi"},
        {"Uzbekistan", "uz", "Tashkent"},
        {"Vietnam", "vn", "Hanoi"},
        {"Yemen", "ye", "Sana'a"}
    };
    
    public static final String[][] OCEANIA = {
        {"Australia", "au", "Canberra"},
        {"Fiji", "fj", "Suva"},
        {"Kiribati", "ki", "South Tarawa"},
        {"Marshall Islands", "mh", "Majuro"},
        {"Micronesia", "fm", "Palikir"},
        {"Nauru", "nr", "Yaren"},
        {"New Zealand", "nz", "Wellington"},
        {"Palau", "pw", "Ngerulmud"},
        {"Papua New Guinea", "pg", "Port Moresby"},
        {"Samoa", "ws", "Apia"},
        {"Solomon Islands", "sb", "Honiara"},
        {"Tonga", "to", "Nuku'alofa"},
        {"Tuvalu", "tv", "Funafuti"},
        {"Vanuatu", "vu", "Port Vila"}
    };
    
    private JPanel contentPanel;
    private JScrollPane scrollPane;

    public AprenderPanel() {
        setLayout(new BorderLayout());
        
        // Create continent selector
        JComboBox<String> continentCombo = new JComboBox<>();
        continentCombo.addItem("America");
        continentCombo.addItem("Europe");
        continentCombo.addItem("Asia");
        continentCombo.addItem("Oceania");
        
        continentCombo.addActionListener(this::changeContinent);
        add(continentCombo, BorderLayout.NORTH);
        
        // Create content panel with scroll
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        
        scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);
        
        // Load initial continent (America)
        loadCountries(AMERICA);
    }
    
    private void changeContinent(ActionEvent e) {
        JComboBox<String> combo = (JComboBox<String>) e.getSource();
        String selected = (String) combo.getSelectedItem();
        
        switch(selected) {
            case "America":
                loadCountries(AMERICA);
                break;
            case "Europe":
                loadCountries(EUROPE);
                break;
            case "Asia":
                loadCountries(ASIA);
                break;
            case "Oceania":
                loadCountries(OCEANIA);
                break;
        }
    }
    
    private void loadCountries(String[][] countries) {
        contentPanel.removeAll();
        
        for(String[] country : countries) {
            try {
                contentPanel.add(new PaisPanel(country[0], country[1], country[2]));
                contentPanel.add(Box.createVerticalStrut(5));
            } catch (Exception e) {
                System.err.println("Error loading: " + country[0]);
            }
        }
        
        contentPanel.revalidate();
        contentPanel.repaint();
        
        // Scroll to top
        scrollPane.getVerticalScrollBar().setValue(0);
    }
}