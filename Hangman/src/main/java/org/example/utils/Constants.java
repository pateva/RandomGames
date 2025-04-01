package org.example.utils;

public final class Constants {
    private Constants() {
        // Prevent instantiation
    }

    public static final String YOUR_WORD = "YOUR WORD IS:";
    public static final Character YOUR_LETTER_REPLACEMENT= '_';
    public static final String GUESS_A_LETTER = "GUESS A LETTER OR TAP ZZ + ENTER TO GET A DIFFERENT WORD: ";
    public static final String GET_ANOTHER_WORD = "ZZ";
    public static final String PLAY_AGAIN = "Do you want to play again? (yes/no)";
    public static final String PLAY_AGAIN_YES = "yes";
    public static final String GUESSES_WORD = "CONGRATULATIONS! YOU GUESSED THE WORD!";

    public static final String[] WORDS = {
            "abacus", "abdomen", "ability", "abolish", "absent", "absorb", "abstract", "absurd", "accent", "accept",
            "access", "accident", "acclaim", "account", "accrue", "accuracy", "achieve", "acoustic", "acquire", "acrobat",
            "acronym", "activate", "adaptor", "address", "adhesive", "adjacent", "adjust", "admiral", "advance", "advisor",
            "aerobic", "affable", "afflict", "afford", "afield", "afloat", "afraid", "agency", "agenda", "agile",
            "agitate", "agonize", "aground", "alarmed", "albeit", "alcohol", "alertly", "algebra", "alibi", "alien",
            "align", "alike", "alive", "allergy", "alliance", "allocate", "alloy", "almond", "already", "alright",
            "amalgam", "amateur", "amazing", "ambient", "ambition", "amend", "amnesty", "amorphous", "amount", "amplify",
            "anagram", "analog", "anchor", "ancient", "android", "anecdote", "angelic", "angling", "anguish", "animal",
            "animate", "annex", "annoy", "annual", "another", "answer", "antique", "anxiety", "apathy", "aperture",
            "apex", "aphorism", "aplomb", "apology", "apostle", "apparel", "appeal", "appear", "applaud", "apply",
            "appoint", "approach", "approve", "apricot", "apron", "arcade", "archer", "archive", "ardent", "arena",
            "argue", "arise", "armada", "armful", "aroma", "around", "arrange", "arrest", "arrive", "arrow",
            "arsenic", "article", "artisan", "ascend", "asphalt", "aspire", "assault", "assent", "assert", "assess",
            "asset", "assign", "assist", "assume", "assure", "asteroid", "astonish", "astound", "atlas", "atom",
            "babble", "backdrop", "backfire", "backlash", "backpack", "backup", "bacon", "bacteria", "badger", "baffled",
            "bagel", "baggage", "bailout", "balance", "ballad", "balloon", "ballot", "bamboo", "banish", "bankrupt",
            "banner", "banquet", "barbaric", "barbecue", "barrier", "baseball", "basement", "basically", "basilisk", "basket",
            "bathe", "battery", "battalion", "bayonet", "beacon", "beagle", "beaming", "beanbag", "beaver", "because",
            "beckon", "bedrock", "bedtime", "befriend", "beggar", "begin", "behavior", "behind", "belated", "believe",
            "bellhop", "bellow", "beloved", "bemoan", "bench", "beneath", "benefit", "benevolent", "beyond", "bicycle",
            "bidding", "bifocal", "bigotry", "bizarre", "blabber", "blackout", "bladder", "bland", "blanket", "blaring",
            "blizzard", "blockade", "blogger", "blossom", "blunder", "blurred", "boating", "bodily", "boisterous", "bolster",
            "bondage", "bonfire", "bonus", "boomerang", "booth", "border", "boredom", "borrow", "bother", "bouncing",
            "boundary", "bouquet", "bowling", "boxer", "boycott", "bracelet", "bracket", "brainiac", "bramble", "branch",
            "brandish", "bravery", "brazil", "breach", "breast", "breeze", "brewery", "bribery", "briefcase", "brighten",
            "brisket", "brittle", "broaden", "broker", "bronze", "brother", "browbeat", "bruise", "brunch", "brusque",
            "bubble", "bucket", "buckle", "budding", "buffalo", "buffer", "build", "bulldoze", "bulletin", "bumper",
            "bundle", "bungalow", "burden", "bureau", "burrow", "bustling", "butterfly", "button", "buzzard",
            "cabbage", "cabin", "cactus", "cafe", "calamity", "calculate", "calendar", "caliber", "callous", "calmly",
            "camera", "campfire", "campaign", "canary", "candid", "candle", "cannon", "canoe", "cantata", "capable",
            "capacity", "capital", "captain", "capture", "caravan", "cardigan", "carefree", "cargo", "carpet", "carriage",
            "carrier", "cartoon", "cascade", "casualty", "catalog", "catalyst", "catholic", "caution", "cavalry", "cease",
            "ceiling", "celery", "cement", "censor", "census", "center", "ceramic", "certain", "chamber", "channel",
            "chaos", "chapter", "charcoal", "chariot", "charm", "chassis", "chatter", "cheddar", "cheerful", "chemical",
            "cherry", "chicken", "chisel", "chivalry", "choose", "chorus", "circuit", "citadel", "civic", "civil",
            "clamber", "clarify", "clash", "clasp", "classic", "clause", "clearly", "clergy", "climate", "clinch",
            "cloister", "closet", "clumsy", "cluster", "clutter", "coastal", "cobweb", "coherent", "collage", "collapse",
            "collar", "collect", "colony", "column", "combat", "combine", "comfort", "comic", "command", "commence",
            "commit", "common", "compact", "company", "compare", "compass", "compile", "complex", "compose", "compute",
            "concept", "concise", "concrete", "confess", "confide", "conflict", "conform", "confront", "confuse", "congress",
            "connect", "conquer", "consent", "console", "conspire", "constant", "construct", "consume", "contact", "contain",
            "content", "contest", "context", "control", "convert", "convince", "cookbook", "copper", "copycat", "coral",
            "cordial", "cornice", "correct", "corrode", "corrupt", "cosmic", "costume", "cottage", "cotton", "couch",
            "counter", "country", "courage", "course", "courtly", "cousin", "covering", "cowboy", "crackle", "cranberry",
            "crater", "crawl", "crazy", "creak", "create", "crevice", "crimson", "crisp", "critical", "crochet",
            "crowd", "crown", "crucial", "crumble", "crunch", "crusade", "crystal", "cubic", "cuddle", "culprit",
            "culture", "cumulative", "curious", "current", "curtain", "cushion",
            "dabble", "daily", "daisies", "damage", "dampen", "dancer", "dancing", "daring", "darken", "dashboard",
            "dazzle", "dealer", "dearest", "debate", "debris", "decade", "decent", "decibel", "decipher", "decorate",
            "decrease", "dedicate", "defiant", "deflate", "deflect", "defrost", "degrade", "deity", "delay", "delete",
            "delight", "demand", "demise", "demolish", "denote"
    };
}
