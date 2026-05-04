import java.awt.*;
import javax.swing.*;

public class Main {

    static Color purple = new Color(155, 135, 245);
    static Color softBg = new Color(245, 242, 255);

    public static void main(String[] args) {

        JFrame frame = new JFrame("TabMeSafe 💜");
        frame.setSize(400, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //LIHAT ARAHAN
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(softBg);

        // INI BUAT HEADER
        mainPanel.add(createHeader("Millo 🐻"), BorderLayout.NORTH);

        // CONTENT (switchable)
        JPanel content = new JPanel(new CardLayout());
        content.add(homePage(), "home");
        content.add(milloPage(), "millo");
        content.add(forumPage(), "forum");
        content.add(settingsPage(), "settings");

        mainPanel.add(content, BorderLayout.CENTER);

        // BOTTOM NAV
        mainPanel.add(createBottomNav(content), BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    // 🔝 HEADER
    static JPanel createHeader(String title) {
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(purple);
        header.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JLabel back = new JLabel("←");
        back.setForeground(Color.WHITE);

        JLabel text = new JLabel(title, SwingConstants.CENTER);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel stars = new JLabel("⭐ 3");
        stars.setForeground(Color.WHITE);

        header.add(back, BorderLayout.WEST);
        header.add(text, BorderLayout.CENTER);
        header.add(stars, BorderLayout.EAST);

        return header;
    }

    // 🏠 HOME
    static JPanel homePage() {
        JPanel panel = new JPanel();
        panel.setBackground(softBg);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(space());

        panel.add(title("How are you feeling today? 💜"));

        panel.add(button("🌤 Check Mood"));
        panel.add(button("📖 Diary"));
        panel.add(button("💬 Chat Counselor"));
        panel.add(button("⚠️ Danger Alert"));
        panel.add(button("🎓 Education"));

        return panel;
    }

    // 🐻 MILLO PAGE (MIRIP SKETSA KAMU)
    static JPanel milloPage() {
        JPanel panel = new JPanel();
        panel.setBackground(softBg);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(space());

        JLabel bear = new JLabel("🐻", SwingConstants.CENTER);
        bear.setFont(new Font("Arial", Font.PLAIN, 80));
        bear.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(bear);

        panel.add(title("I'm here for you 💜"));

        panel.add(button("💬 Talk to Millo"));
        panel.add(button("🌤 Check Mood"));
        panel.add(button("🌙 Calm Down"));

        return panel;
    }

    // 💬 FORUM
    static JPanel forumPage() {
        JPanel panel = new JPanel();
        panel.setBackground(softBg);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(post("@safe_user123", "I feel really tired today..."));
        panel.add(post("@moonlight", "Today was overwhelming..."));
        panel.add(post("@softmind", "Anyone else feeling lost lately?"));

        return panel;
    }

    // ⚙️ SETTINGS
    static JPanel settingsPage() {
        JPanel panel = new JPanel();
        panel.setBackground(softBg);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(button("👤 Account"));
        panel.add(button("🔒 Privacy & Safety"));
        panel.add(button("🔔 Notifications"));
        panel.add(button("⭐ VIP & Rewards"));

        return panel;
    }

    // 🔻 BOTTOM NAV
    static JPanel createBottomNav(JPanel content) {
        JPanel nav = new JPanel(new GridLayout(1, 4));
        nav.setBackground(Color.WHITE);

        nav.add(navButton("🏠", "home", content));
        nav.add(navButton("🐻", "millo", content));
        nav.add(navButton("💬", "forum", content));
        nav.add(navButton("⚙️", "settings", content));

        return nav;
    }

    static JButton navButton(String text, String page, JPanel content) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);

        btn.addActionListener(e -> {
            CardLayout cl = (CardLayout) content.getLayout();
            cl.show(content, page);
        });

        return btn;
    }

    // 🔘 BUTTON STYLE
    static JButton button(String text) {
        JButton btn = new JButton(text);
        btn.setMaximumSize(new Dimension(300, 40));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setBackground(purple);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        panelSpacing(btn);

        return btn;
    }

    // 📝 POST CARD
    static JPanel post(String user, String text) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        card.add(new JLabel(user));
        card.add(new JLabel(text));

        panelSpacing(card);

        return card;
    }

    // ✨ TEXT TITLE
    static JLabel title(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        panelSpacing(label);
        return label;
    }

    // 🧱 SPACING
    static void panelSpacing(JComponent comp) {
        comp.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    }

    static Component space() {
        return Box.createRigidArea(new Dimension(0, 20));
    }
}